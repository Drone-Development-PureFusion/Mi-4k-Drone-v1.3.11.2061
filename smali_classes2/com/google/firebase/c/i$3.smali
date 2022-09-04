.class Lcom/google/firebase/c/i$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/g/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/c/i;->a(J)Lcom/google/android/gms/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field final synthetic b:Lcom/google/android/gms/g/g;

.field final synthetic c:Lcom/google/firebase/c/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/firebase/c/i;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/firebase/c/i$3;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/google/firebase/c/i;Lcom/google/android/gms/g/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/c/i$3;->c:Lcom/google/firebase/c/i;

    iput-object p2, p0, Lcom/google/firebase/c/i$3;->b:Lcom/google/android/gms/g/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 2
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/firebase/c/g;->a(Ljava/lang/Throwable;I)Lcom/google/firebase/c/g;

    move-result-object v0

    sget-boolean v1, Lcom/google/firebase/c/i$3;->a:Z

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iget-object v1, p0, Lcom/google/firebase/c/i$3;->b:Lcom/google/android/gms/g/g;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    return-void
.end method
