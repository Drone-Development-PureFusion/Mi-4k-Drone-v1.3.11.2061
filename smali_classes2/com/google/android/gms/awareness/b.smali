.class public Lcom/google/android/gms/awareness/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/a$a$d;


# static fields
.field public static final a:I = -0x1


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:I

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:I


# direct methods
.method protected constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/awareness/b;->b:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/awareness/b;->c:I

    iput-object p3, p0, Lcom/google/android/gms/awareness/b;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/awareness/b;->e:Ljava/lang/String;

    iput p5, p0, Lcom/google/android/gms/awareness/b;->f:I

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/google/android/gms/awareness/b;
    .locals 6

    const/4 v3, 0x0

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/awareness/b;

    const/4 v2, 0x1

    const/4 v5, -0x1

    move-object v1, p0

    move-object v4, v3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/awareness/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/awareness/b;->c:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/awareness/b;->f:I

    return v0
.end method
