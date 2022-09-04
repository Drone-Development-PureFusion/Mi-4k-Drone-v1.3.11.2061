.class Lcom/google/android/gms/internal/fk$a$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/fk$a;->a()Landroid/view/Choreographer$FrameCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/fk$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/fk$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fk$a$1;->a:Lcom/google/android/gms/internal/fk$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public doFrame(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fk$a$1;->a:Lcom/google/android/gms/internal/fk$a;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/fk$a;->a(J)V

    return-void
.end method
