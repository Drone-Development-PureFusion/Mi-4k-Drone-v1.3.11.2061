.class public Lcom/google/android/gms/internal/dm$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/dm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:[B

.field private final b:J

.field private final c:Lcom/google/android/gms/internal/dd;

.field private final d:Lcom/google/android/gms/internal/dv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/dd;[BLcom/google/android/gms/internal/dv;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/dm$a;->c:Lcom/google/android/gms/internal/dd;

    iput-object p2, p0, Lcom/google/android/gms/internal/dm$a;->a:[B

    iput-object p3, p0, Lcom/google/android/gms/internal/dm$a;->d:Lcom/google/android/gms/internal/dv;

    iput-wide p4, p0, Lcom/google/android/gms/internal/dm$a;->b:J

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/dv;)V
    .locals 6

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v2, v1

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/dm$a;-><init>(Lcom/google/android/gms/internal/dd;[BLcom/google/android/gms/internal/dv;J)V

    return-void
.end method


# virtual methods
.method public a()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dm$a;->a:[B

    return-object v0
.end method

.method public b()Lcom/google/android/gms/internal/dd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dm$a;->c:Lcom/google/android/gms/internal/dd;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/internal/dv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dm$a;->d:Lcom/google/android/gms/internal/dv;

    return-object v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/dm$a;->b:J

    return-wide v0
.end method
