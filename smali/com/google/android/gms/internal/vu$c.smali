.class Lcom/google/android/gms/internal/vu$c;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/vu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/vu;

.field private final b:Lcom/google/android/gms/internal/vu$d;

.field private final c:Z

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/vu;ZLcom/google/android/gms/internal/vu$d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/vu$c;->a:Lcom/google/android/gms/internal/vu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/google/android/gms/internal/vu$c;->c:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/vu$c;->b:Lcom/google/android/gms/internal/vu$d;

    iput-object p4, p0, Lcom/google/android/gms/internal/vu$c;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/vu$c;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/internal/vu$d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/vu$c;->b:Lcom/google/android/gms/internal/vu$d;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/vu$c;->c:Z

    return v0
.end method
