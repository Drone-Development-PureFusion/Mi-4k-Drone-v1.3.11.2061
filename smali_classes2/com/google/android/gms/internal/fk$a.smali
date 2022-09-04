.class public abstract Lcom/google/android/gms/internal/fk$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/fk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Runnable;

.field private b:Landroid/view/Choreographer$FrameCallback;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()Landroid/view/Choreographer$FrameCallback;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/fk$a;->b:Landroid/view/Choreographer$FrameCallback;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/fk$a$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/fk$a$1;-><init>(Lcom/google/android/gms/internal/fk$a;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/fk$a;->b:Landroid/view/Choreographer$FrameCallback;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fk$a;->b:Landroid/view/Choreographer$FrameCallback;

    return-object v0
.end method

.method public abstract a(J)V
.end method

.method b()Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fk$a;->a:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/fk$a$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/fk$a$2;-><init>(Lcom/google/android/gms/internal/fk$a;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/fk$a;->a:Ljava/lang/Runnable;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fk$a;->a:Ljava/lang/Runnable;

    return-object v0
.end method
