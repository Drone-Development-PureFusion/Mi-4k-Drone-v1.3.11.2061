.class Lcom/google/android/gms/cast/framework/media/a/b$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/SeekBar;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/framework/media/a/b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/framework/media/a/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/a/b$1;->a:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 4

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b$1;->a:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Lcom/google/android/gms/cast/framework/media/a/b;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/agj;

    int-to-long v2, p2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/agj;->a(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b$1;->a:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Lcom/google/android/gms/cast/framework/media/a/b;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/agj;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/agj;->a(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b$1;->a:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Lcom/google/android/gms/cast/framework/media/a/b;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/agj;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/agj;->a(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method
