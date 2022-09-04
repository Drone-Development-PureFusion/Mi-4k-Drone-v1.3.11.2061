.class public Lcom/google/android/gms/vision/face/b$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/face/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:I

.field private c:Z

.field private d:I

.field private e:Z

.field private f:I

.field private g:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v1, p0, Lcom/google/android/gms/vision/face/b$a;->b:I

    iput-boolean v1, p0, Lcom/google/android/gms/vision/face/b$a;->c:Z

    iput v1, p0, Lcom/google/android/gms/vision/face/b$a;->d:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/vision/face/b$a;->e:Z

    iput v1, p0, Lcom/google/android/gms/vision/face/b$a;->f:I

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/google/android/gms/vision/face/b$a;->g:F

    iput-object p1, p0, Lcom/google/android/gms/vision/face/b$a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(F)Lcom/google/android/gms/vision/face/b$a;
    .locals 3

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid proportional face size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput p1, p0, Lcom/google/android/gms/vision/face/b$a;->g:F

    return-object p0
.end method

.method public a(I)Lcom/google/android/gms/vision/face/b$a;
    .locals 3

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x22

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid landmark type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput p1, p0, Lcom/google/android/gms/vision/face/b$a;->b:I

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/vision/face/b$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/vision/face/b$a;->c:Z

    return-object p0
.end method

.method public a()Lcom/google/android/gms/vision/face/b;
    .locals 3

    new-instance v0, Lcom/google/android/gms/vision/face/internal/client/FaceSettingsParcel;

    invoke-direct {v0}, Lcom/google/android/gms/vision/face/internal/client/FaceSettingsParcel;-><init>()V

    iget v1, p0, Lcom/google/android/gms/vision/face/b$a;->f:I

    iput v1, v0, Lcom/google/android/gms/vision/face/internal/client/FaceSettingsParcel;->b:I

    iget v1, p0, Lcom/google/android/gms/vision/face/b$a;->b:I

    iput v1, v0, Lcom/google/android/gms/vision/face/internal/client/FaceSettingsParcel;->c:I

    iget v1, p0, Lcom/google/android/gms/vision/face/b$a;->d:I

    iput v1, v0, Lcom/google/android/gms/vision/face/internal/client/FaceSettingsParcel;->d:I

    iget-boolean v1, p0, Lcom/google/android/gms/vision/face/b$a;->c:Z

    iput-boolean v1, v0, Lcom/google/android/gms/vision/face/internal/client/FaceSettingsParcel;->e:Z

    iget-boolean v1, p0, Lcom/google/android/gms/vision/face/b$a;->e:Z

    iput-boolean v1, v0, Lcom/google/android/gms/vision/face/internal/client/FaceSettingsParcel;->f:Z

    iget v1, p0, Lcom/google/android/gms/vision/face/b$a;->g:F

    iput v1, v0, Lcom/google/android/gms/vision/face/internal/client/FaceSettingsParcel;->g:F

    new-instance v1, Lcom/google/android/gms/vision/face/internal/client/a;

    iget-object v2, p0, Lcom/google/android/gms/vision/face/b$a;->a:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/vision/face/internal/client/a;-><init>(Landroid/content/Context;Lcom/google/android/gms/vision/face/internal/client/FaceSettingsParcel;)V

    new-instance v0, Lcom/google/android/gms/vision/face/b;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/vision/face/b;-><init>(Lcom/google/android/gms/vision/face/internal/client/a;Lcom/google/android/gms/vision/face/b$1;)V

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/vision/face/b$a;
    .locals 3

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x28

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid classification type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput p1, p0, Lcom/google/android/gms/vision/face/b$a;->d:I

    return-object p0
.end method

.method public b(Z)Lcom/google/android/gms/vision/face/b$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/vision/face/b$a;->e:Z

    return-object p0
.end method

.method public c(I)Lcom/google/android/gms/vision/face/b$a;
    .locals 3

    packed-switch p1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iput p1, p0, Lcom/google/android/gms/vision/face/b$a;->f:I

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
