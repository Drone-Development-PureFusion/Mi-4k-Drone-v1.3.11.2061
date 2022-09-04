.class Lcom/google/android/gms/internal/me$a$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/me$a;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/me$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/me$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/me$a$1;->a:Lcom/google/android/gms/internal/me$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/me$a$1;->a:Lcom/google/android/gms/internal/me$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/me$a;->a:Lcom/google/android/gms/internal/me;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/me;->a(Ljava/lang/Throwable;)V

    return-void
.end method
