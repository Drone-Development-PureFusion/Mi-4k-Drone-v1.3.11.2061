.class Lcom/google/android/gms/analytics/p$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/analytics/p;->a(Lcom/google/android/gms/analytics/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/analytics/l;

.field final synthetic b:Lcom/google/android/gms/analytics/p;


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/p;Lcom/google/android/gms/analytics/l;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/analytics/p$1;->b:Lcom/google/android/gms/analytics/p;

    iput-object p2, p0, Lcom/google/android/gms/analytics/p$1;->a:Lcom/google/android/gms/analytics/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/analytics/p$1;->a:Lcom/google/android/gms/analytics/l;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/l;->h()Lcom/google/android/gms/analytics/o;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/analytics/p$1;->a:Lcom/google/android/gms/analytics/l;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/o;->a(Lcom/google/android/gms/analytics/l;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/p$1;->b:Lcom/google/android/gms/analytics/p;

    invoke-static {v0}, Lcom/google/android/gms/analytics/p;->a(Lcom/google/android/gms/analytics/p;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/analytics/q;

    iget-object v2, p0, Lcom/google/android/gms/analytics/p$1;->a:Lcom/google/android/gms/analytics/l;

    invoke-interface {v0, v2}, Lcom/google/android/gms/analytics/q;->a(Lcom/google/android/gms/analytics/l;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/p$1;->b:Lcom/google/android/gms/analytics/p;

    iget-object v1, p0, Lcom/google/android/gms/analytics/p$1;->a:Lcom/google/android/gms/analytics/l;

    invoke-static {v0, v1}, Lcom/google/android/gms/analytics/p;->a(Lcom/google/android/gms/analytics/p;Lcom/google/android/gms/analytics/l;)V

    return-void
.end method
