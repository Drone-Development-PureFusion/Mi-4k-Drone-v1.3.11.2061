.class Lcom/google/android/gms/internal/agd$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/agd;-><init>(Landroid/widget/SeekBar;JLandroid/widget/SeekBar$OnSeekBarChangeListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

.field final synthetic b:Lcom/google/android/gms/internal/agd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/agd;Landroid/widget/SeekBar$OnSeekBarChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/agd$1;->b:Lcom/google/android/gms/internal/agd;

    iput-object p2, p0, Lcom/google/android/gms/internal/agd$1;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agd$1;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/agd$1;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-interface {v0, p1, p2, p3}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onProgressChanged(Landroid/widget/SeekBar;IZ)V

    :cond_0
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/agd$1;->b:Lcom/google/android/gms/internal/agd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/agd;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agd$1;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/agd$1;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-interface {v0, p1}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onStartTrackingTouch(Landroid/widget/SeekBar;)V

    :cond_0
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/agd$1;->b:Lcom/google/android/gms/internal/agd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/agd;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agd$1;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/agd$1;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-interface {v0, p1}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onStopTrackingTouch(Landroid/widget/SeekBar;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agd$1;->b:Lcom/google/android/gms/internal/agd;

    invoke-static {v0}, Lcom/google/android/gms/internal/agd;->a(Lcom/google/android/gms/internal/agd;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v1

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/cast/framework/media/c;->a(J)Lcom/google/android/gms/common/api/i;

    :cond_1
    return-void
.end method
